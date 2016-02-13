/**
 * 
 */
import java.awt.Color;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author adriancf
 *
 */
public enum StaffGays {

	Jotinha_BR(0,CorDosViado()+ "Jotinha_BR"),
	_Unix52(1,CorDosViado()+"_Unix52"),
	BrinePlay(2,CorDosViado()+"BrinePLay");
	
	public int numero;
	public String staff;
	private static final List<StaffGays> PlanetaStaff = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = PlanetaStaff.size();
	private static final Random RandomPS = new Random();

 public static StaffGays umstaff()  {
	return PlanetaStaff.get(RandomPS.nextInt(SIZE));
	 }
			  
	private StaffGays(int numero,String staff)
	  {
		this.numero = numero;
		this.staff = staff;
	
	  }
	public String nome()
	{
		return staff;
	}
	
	private static Color CorDosViado()
	{
		Color cor  = new Color(64, 64, 64);
		return cor;
	}
	
}
