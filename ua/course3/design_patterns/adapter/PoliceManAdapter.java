package ua.course3.design_patterns.adapter;

public class PoliceManAdapter extends PoliceMan {

    private Militioner militioner;

 //   private Vocabulary vocabulary;

    public PoliceManAdapter(Militioner militioner){
        this.militioner = militioner;
    }

    @Override
    public void doGoodJob() {
        militioner.serve();
    }
}
