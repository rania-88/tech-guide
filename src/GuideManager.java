import java.util.ArrayList;
public class GuideManager{
    private ArrayList<Guide> guides = new ArrayList <>();
    public void addGuide(String title, String steps){
        guides.add(new Guide( title, steps));
    }
    public ArrayList<Guide > getAllGuide(){
        return guides;
    }
    public Guide findByTitle(String title){
        for(Guide guide : guides){
            if (guide.getTitle() .equalsIgnoreCase(title)) return guide;
        }
        return null;

    }
}
