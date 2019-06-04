package CarUml.Eddy;
public class SUV extends Car{
    private String bullBar;


    public SUV(String bullBar) {
        this.bullBar = bullBar;
    }

    public SUV() {
		// TODO Auto-generated constructor stub
	}

	public String getBullBar() {
        return bullBar;
    }

    public void setBullBar(String bullBar) {
        this.bullBar = bullBar;
    }

    public void spinRims(){}

    @Override
    public String toString() {
        return "SUV{" +
                "bullBar='" + bullBar + '\'' +
                '}';
    }
}
