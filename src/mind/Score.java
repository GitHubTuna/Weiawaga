package mind;

public class Score {
    public int mg;
    public int eg;

    public Score(){
        this.mg = 0;
        this.eg = 0;
    }

    public Score(int mg, int eg){
        this.mg = mg;
        this.eg = eg;
    }

    public void add(Score other, int mult){
        this.mg += mult*other.mg;
        this.eg += mult*other.eg;
    }

    public void add(Score other){
        this.mg += other.mg;
        this.eg += other.eg;
    }

    public void sub(Score other){
        this.mg -= other.mg;
        this.eg -= other.eg;
    }

    public void sub(Score other, int mult){
        this.mg -= mult*other.mg;
        this.eg -= mult*other.eg;
    }

    public int eval(int phase){
        phase = (phase*256 + (Evaluation.TOTAL_PHASE / 2)) / Evaluation.TOTAL_PHASE;
        return ((this.mg*(256 - phase)) + (this.eg * phase))/256;
    }

}
