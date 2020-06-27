package TestNgListeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class MyTransformer  implements IAnnotationTransformer{
	
// it will listen all test cases . if any failed - Listenres - IAnnotationTransoformer	
	
	public void transform(
		      ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		
		
		annotation.setRetryAnalyzer(RoetryAnalyzer.class);
		
		/*
		if(testMethod.getName().contains("Create")) {
			annotation.setInvocationCount(3);
		}
		    
		  }
	*/
	

}
