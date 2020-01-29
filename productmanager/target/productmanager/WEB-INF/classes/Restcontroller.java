import java.awt.List;

@RestController
public class Restcontroller {
	List l<Product>=new Array list()
			l.add("hii");
	        l.add("hello");
	        l.add(1111);
	        l.add("Dinesh");
	@RequestMapping("/data")
public String getData()
{
		return "Hiii";
}
@RequestMapping("/jsondata")
public String getData()
{
	return "Hello";
}

}
