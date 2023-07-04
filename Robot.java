import java.util.Scanner;

public class RobotSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // read in the initial position, direction, and map size from the user
        System.out.print("Enter the initial position of the robot (x,y): ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.nextLine(); // consume the newline character
        System.out.print("Enter the initial direction of the robot (north/south/east/west): ");
        String directionStr = scanner.nextLine();
        int direction;
        switch (directionStr) {
            case "north":
                direction = 0;
                break;
            case "east":
                direction = 90;
                break;
            case "south":
                direction = 180;
                break;
            case "west":
                direction = 270;
                break;
            default:
                System.out.println("Invalid direction. Defaulting to north.");
                direction = 0;
                break;
        }
        System.out.print("Enter the size of the map (width,height): ");
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        int[][] map = new int[height][width];

        // read in the commands for the robot to execute
        System.out.print("Enter the commands for the robot (e.g. A9R1A2): ");
        String commands = scanner.nextLine();

        // simulate the movement of the robot on the map
        Robot robot = new Robot(x, y, direction, map);
        for (int i = 0; i < commands.length(); i++) {
            char command = commands.charAt(i);
            switch (command) {
                case 'A':
                    int steps = Integer.parseInt(commands.substring(i+1, i+2));
                    robot.move(steps);
                    break;
                case 'R':
                    int degrees = Integer.parseInt(commands.substring(i+1, i+2));
                    robot.rotate(degrees * 90);
                    break;
                default:
                    continue;
            }
        }

        // display the final position of the robot on the map
        robot.print();}}
