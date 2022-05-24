package breakout;

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Breakout extends GraphicsProgram {

	/** Width and height of application window in pixels */
	public static final int APPLICATION_WIDTH = 400;
	public static final int APPLICATION_HEIGHT = 600;

	/** Dimensions of game board (usually the same) */
	private static final int WIDTH = APPLICATION_WIDTH;
	private static final int HEIGHT = APPLICATION_HEIGHT;

	/** Dimensions of the paddle */
	private static final int PADDLE_WIDTH = 60;
	private static final int PADDLE_HEIGHT = 10;

	/** Offset of the paddle up from the bottom */
	private static final int PADDLE_Y_OFFSET = 30;

	/** Number of bricks per row */
	private static final int NBRICKS_PER_ROW = 10;

	/** Number of rows of bricks */
	private static final int NBRICK_ROWS = 10;

	/** Separation between bricks */
	private static final int BRICK_SEP = 4;

	/** Width of a brick */
	private static final int BRICK_WIDTH = (WIDTH - (NBRICKS_PER_ROW - 1) * BRICK_SEP) / NBRICKS_PER_ROW;

	/** Height of a brick */
	private static final int BRICK_HEIGHT = 8;

	/** Radius of the ball in pixels */
	private static final int BALL_RADIUS = 10;

	/** Offset of the top brick row from the top */
	private static final int BRICK_Y_OFFSET = 70;

	/** Number of turns */
	private static final int NTURNS = 3;

	/** Delay time in milliseconds */
	private static final int DELAY = 10;

	/* Method: run() */
	
	/** Setting size of Window */
	public void init() {
		setSize(WIDTH, HEIGHT);
	}
	
	/** Runs the Breakout program. */
	public void run() {
		
		for (int i = 0; i < NTURNS; i++) {
			setUpGame();
			playGame();
			if (brickCounter == 0) {
				ball.setVisible(false);
				printWinner();
				break;
			}
			if (brickCounter > 0) {
				removeAll();
			}

		}
		if (brickCounter > 0) {
			printGameOver();
		}
	}

	private void setUpGame() {
		drawBricks();
		drawPaddle();
		drawBall();
	}

	private void drawBricks() {
		int x = BRICK_SEP / 2;
		int y = BRICK_Y_OFFSET;
		int rowcount = 1;
		GRect brick;
		for (int i = 0; i < NBRICK_ROWS; i++) {
			for (int j = 0; j < NBRICKS_PER_ROW; j++) {
				brick = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
				add(brick);
				brick.setFilled(true);
				x += BRICK_WIDTH + BRICK_SEP;
				if (rowcount <= 2) {
					brick.setColor(Color.RED);
				} else if (rowcount == 3 || rowcount == 4) {
					brick.setColor(Color.ORANGE);
				} else if (rowcount == 5 || rowcount == 6) {
					brick.setColor(Color.YELLOW);
				} else if (rowcount == 7 || rowcount == 8) {
					brick.setColor(Color.GREEN);
				} else {
					brick.setColor(Color.CYAN);
				}
			}
			x = BRICK_SEP / 2;
			y += BRICK_HEIGHT + BRICK_SEP;
			rowcount++;
		}
	}

	private void drawPaddle() {
		int px = (getWidth() / 2) - (PADDLE_WIDTH / 2);
		int py = getHeight() - PADDLE_Y_OFFSET;
		paddle = new GRect(px, py, PADDLE_WIDTH, PADDLE_HEIGHT);
		add(paddle);
		paddle.setFilled(true);
		paddle.setColor(Color.BLACK);
		addMouseListeners();
	}

	private void drawBall() {
		ball = new GOval((getWidth() / 2) - BALL_RADIUS, (getHeight() / 2) - BALL_RADIUS, BALL_RADIUS * 2,
				BALL_RADIUS * 2);
		ball.setFilled(true);
		ball.setFillColor(Color.BLACK);
		add(ball);
	}

	private void playGame() {
		waitForClick();
		getBallVelocity();
		while (true) {
			moveBall();
			if (ball.getY() > getHeight()) {
				break;
			}
			if (brickCounter == 0) {
				break;
			}
		}
	}

	private void getBallVelocity() {
		vy = 3.0;
		vx = rgen.nextDouble(1.0, 3.0);
		if (rgen.nextBoolean(0.5))
			vx = -vx;
		// while (ball.getY() < getHeight() && ball.getX() < getWidth()) {
		// pause(DELAY);
		// moveBall();
	}

	private void moveBall() {
		ball.move(vx, vy);
		// Check for walls
		if (ball.getX() - vx <= 0 && vx < 0 || (ball.getX() + vx >= (getWidth() - BALL_RADIUS * 2) && vx > 0)) {
			vx = -vx;
		}
		if (ball.getY() - vy <= 0 && vy < 0) {
			vy = -vy;
		}
		GObject collider = getCollidingObject();
		if (collider == paddle) {
			/*
			 * We need to make sure that the ball only bounces off the top part
			 * of the paddle and also that it doesn't "stick" to it if different
			 * sides of the ball hit the paddle quickly and get the ball "stuck"
			 * on the paddle. I ran "println ("vx: " + vx + ", vy: " + vy + ",
			 * ballX: " + ball.getX() + ", ballY: " +ball.getY());" and found
			 * that the ball.getY() changes by 4 every time, instead of 1, so it
			 * never reaches exactly the the height at which the ball hits the
			 * paddle (paddle height + ball height), therefore, I estimate the
			 * point to be greater or equal to the height at which the ball hits
			 * the paddle, but less than the height where the ball hits the
			 * paddle minus 4.
			 */

			if (ball.getY() >= getHeight() - PADDLE_Y_OFFSET - PADDLE_HEIGHT - BALL_RADIUS * 2
					&& ball.getY() < getHeight() - PADDLE_Y_OFFSET - PADDLE_HEIGHT - BALL_RADIUS * 2 + 4) {
				vy = -vy;
			}
		}
		// since we lay down a row of bricks, the last brick in the brick wall
		// is assigned the value brick.
		// so we narrow it down by saying that the collier does not equal to a
		// paddle or null,
		// so all that is left is the brick
		else if (collider != null) {
			remove(collider);
			brickCounter--;
			vy = -vy;
		}
		pause(DELAY);
	}

	private GObject getCollidingObject() {

		if ((getElementAt(ball.getX(), ball.getY())) != null) {
			return getElementAt(ball.getX(), ball.getY());
		} else if (getElementAt((ball.getX() + BALL_RADIUS * 2), ball.getY()) != null) {
			return getElementAt(ball.getX() + BALL_RADIUS * 2, ball.getY());
		} else if (getElementAt(ball.getX(), (ball.getY() + BALL_RADIUS * 2)) != null) {
			return getElementAt(ball.getX(), ball.getY() + BALL_RADIUS * 2);
		} else if (getElementAt((ball.getX() + BALL_RADIUS * 2), (ball.getY() + BALL_RADIUS * 2)) != null) {
			return getElementAt(ball.getX() + BALL_RADIUS * 2, ball.getY() + BALL_RADIUS * 2);
		}
		// need to return null if there are no objects present
		else {
			return null;
		}
	}

	// Making the mouse track the paddle
	public void mouseMoved(MouseEvent e) {
		/*
		 * The mouse tracks the middle point of the paddle. If the middle point
		 * of the paddle is between half paddle width of the screen and half a
		 * paddle width before the end of the screen, the x location of the
		 * paddle is set at where the mouse is minus half a paddle's width, and
		 * the height remains the same
		 */
		if ((e.getX() < getWidth() - PADDLE_WIDTH / 2) && (e.getX() > PADDLE_WIDTH / 2)) {
			paddle.setLocation(e.getX() - PADDLE_WIDTH / 2, getHeight() - PADDLE_Y_OFFSET - PADDLE_HEIGHT);
		}
	}

	private void printGameOver() {
		GLabel gameOver = new GLabel("Game Over", getWidth() / 2, getHeight() / 2);
		gameOver.move(-gameOver.getWidth() / 2, -gameOver.getHeight());
		gameOver.setColor(Color.RED);
		add(gameOver);
	}

	private void printWinner() {
		GLabel Winner = new GLabel("Winner!!", getWidth() / 2, getHeight() / 2);
		Winner.move(-Winner.getWidth() / 2, -Winner.getHeight());
		Winner.setColor(Color.RED);
		add(Winner);
	}

	// Instance variables
	private GOval ball;
	private double vx, vy;
	private GRect paddle;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private int brickCounter = 100;
}