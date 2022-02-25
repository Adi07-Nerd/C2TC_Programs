package annotationDemo;

import java.lang.annotation.Annotation;
@SmartPhone(os="Android",version=6)
class Nokia_Series
{
	String model;
	int screensize;
	public Nokia_Series(String model, int screensize) {
		super();
		this.model = model;
		this.screensize = screensize;
	}
	
}
@VoiceAssistant(Name="Alexa",Os="Andorid",ParentCompany="Amazon")
class Amazon
{
	String ver="1.5";
	String androidVer="10.2";
	String ownerName="";
	public Amazon(String ver, String androidVer, String ownerName) {
		this.ver = ver;
		this.androidVer = androidVer;
		this.ownerName = ownerName;
	}
	
}
public class FirstAnnotationDemo {

	public static void main(String[] args) {
//		Nokia_Series obj=new Nokia_Series("Fire", 4);
//		System.out.println(obj.model);
//		System.out.println(obj.screensize);
//		Class c=obj.getClass();
//		Annotation an=c.getAnnotation(SmartPhone.class);
//		SmartPhone s=(SmartPhone)an;
//		System.out.println(s.os());
//		System.out.println(s.version());
		
		
		Amazon c1=new Amazon("1.5", "9", "Bala");
		System.out.println(c1.ver);
		System.out.println(c1.androidVer);
		System.out.println(c1.ownerName);
		
		Class g=c1.getClass();
		Annotation n=g.getAnnotation(VoiceAssistant.class);
		VoiceAssistant v1=(VoiceAssistant)n;
		System.out.println(v1.Name());
		System.out.println(v1.Os());
		System.out.println(v1.ParentCompany());
	}

}
