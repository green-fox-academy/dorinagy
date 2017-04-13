import java.awt.*;

/**
 * Created by Nagy Dóra on 2017.04.12..
 */
public class Area {
  static int[][] wallMap;
  int[][] newArea = {
          {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
          {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
          {0, 1, 1, 1, 0, 1, 0, 1, 1, 0},
          {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
          {1, 1, 1, 1, 0, 1, 1, 1, 1, 0},
          {0, 1, 0, 1, 0, 0, 0, 0, 1, 0},
          {0, 1, 0, 1, 0, 1, 1, 0, 1, 0},
          {0, 0, 0, 1, 0, 0, 0, 0, 1, 0},
          {0, 0, 0, 0, 0, 1, 1, 0, 1, 0},
          {0, 1, 0, 0, 0, 1, 0, 0, 0, 0}
  };

  public Area() {
    wallMap = newArea;
  }

  public void drawArea(Graphics graphics) {
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (this.wallMap[j][i] == 1) {
          Wall newWall = new Wall(i, j);
          newWall.draw(graphics);
        } else {
          Floor newFloor = new Floor(i, j);
          newFloor.draw(graphics);
        }
      }
    }
  }

  public static boolean isWall(int x, int y) {
    if (wallMap[y][x] == 1) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean isEmpty(int x, int y) {
    for (int i = 0; i < App.monsterMap.size(); i++) {
      if (x == App.monsterMap.get(i).posX && y == App.monsterMap.get(i).posY) {
        return false;
      }
    }
    return true;
  }
}
