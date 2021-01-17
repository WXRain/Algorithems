package easy;

public class CheckStraightLine1232 {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length < 2) return true;
        for (int i = 1; i < coordinates.length; i++) {
            if ((coordinates[1][1] - coordinates[0][1]) * (coordinates[i][0] - coordinates[0][0]) != ((coordinates[i][1] - coordinates[0][1]) * (coordinates[1][0] - coordinates[0][0]))) {
                return false;
            }
        }
        return true;
    }
}
