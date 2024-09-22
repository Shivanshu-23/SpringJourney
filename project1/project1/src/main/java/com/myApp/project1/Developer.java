package com.myApp.project1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


// Developer class, registered as a Spring bean due to the @Component annotation
@Component  // This annotation tells Spring to automatically detect this class during component scanning
public class Developer  {
    // Field Injection - Spring injects the Laptop bean directly into this field.
    @Autowired //  Enable field injection
    @Qualifier("desktop") // Specifies that the 'desktop' bean should be injected here
    private Computer laptop1;

    // Constructor Injection - Recommended for mandatory dependencies.
// This approach ensures that the dependency is provided when the object is created.
//    @Autowired  // Optional; Spring will inject the dependency even without this annotation.
//    public Developer(Laptop laptop1) {
//        this.laptop1 = laptop1;  // Assigning the injected Laptop instance to the field.
//    }

    // Setter Injection - Useful for optional dependencies.
// This method allows you to change the dependency after the object is created.
//    @Autowired  // Spring will call this setter to inject the Laptop dependency.
//    public void setLaptop(Laptop laptop1) {
//        this.laptop1 = laptop1;  // Assigning the injected Laptop instance.
//    }


    public void build(){
        System.out.println("Something Cool is made by Shivanshu");
        System.out.println("Developer is building the project...");
        laptop1.compile();
    }
}
    