




public class orderObject extends Object
{
    private double qJames;
    private double pNadine;

    public orderObject()
    {
        qJames=0;
        pNadine=0;
    }
    public orderObject(double qJames,double pNadine)
    {

    	this.qJames=qJames;
		this.pNadine=pNadine;
    }

    public double order()
    {
    	return (qJames*pNadine);
    }
    public String toString()
    {
    	return ""+order();
    }
}