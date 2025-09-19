import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
//Instantiates the background painter
BackgroundPainter ayaan = new BackgroundPainter();
    ayaan.paintBackground("PaleGreen");
//Instantiates the Outlune painter
CapybaraOutlinePainter ayaan2 = new CapybaraOutlinePainter();
    ayaan2.paintCapybaraOutline("black");
//Instantiates the Dark Brown spots painter
CapybaraDarkBrownPainter ayaan3 = new CapybaraDarkBrownPainter();
    ayaan3.paintCapybaraDarkBrown("SaddleBrown");
//Instantiates the light brown spots painter
CapybaraLightBrownPainter ayaan4 = new CapybaraLightBrownPainter();
    ayaan4.paintCapybaraLightBrown("sienna");
  }
}