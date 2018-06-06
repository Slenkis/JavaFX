package animation;

import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.util.Duration;

public class FailAnimation {
    private TranslateTransition tt;

    public FailAnimation(Node node) {
        tt = new TranslateTransition(Duration.millis(70d), node);
        tt.setFromX(0d);
        tt.setByX(10d);
        tt.setCycleCount(7);
        tt.setAutoReverse(true);
    }
    public void playFailAnim() {
        tt.playFromStart();
    }
}
