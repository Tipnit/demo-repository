
public class KidsController {
    private KidsService kidsservice;

    public KidsController(KidsService kidsservice) {
        this.kidsservice = kidsservice;
    }

    @GetMapping("/")
    public ArrayList<Kids> getKids()
    {
        ArrayList<Kids> list = new ArrayList<>();
        ArrayList<Kids> kids = kidsservice.retrievekids();

        for(Kids k : kidsservice)
            list.add(o.getKids());

        return list;
    }
}
