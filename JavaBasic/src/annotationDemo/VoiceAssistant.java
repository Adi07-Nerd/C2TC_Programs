package annotationDemo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.RUNTIME)
public @interface VoiceAssistant {
	String Name() default "Google Assistant";
	String Os() default "Android";
	String ParentCompany() default "Alphabet";
}
