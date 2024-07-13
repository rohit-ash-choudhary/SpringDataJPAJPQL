package src.com.main.SpringDataJPAQueryMethod;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sp.entity.MatutalFund;
import com.sp.resources.SpringConfigFile;
import com.sp.service.MatualFundService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext  context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
        MatualFundService mfs=(MatualFundService) context.getBean("matualFundService");
      MatutalFund mf=mfs.getMatualFundetailbyOwnname("John Doe");
        
     System.out.println("Fund num: "+mf.getNum());
     System.out.println("Fund name: "+mf.getName());
     System.out.println("Fund num: "+mf.getFund());
        System.out.println("Fund num: "+mf.getOwn());
        
//        List<MatutalFund> ml=mfs.getnumGreatherThen(1);
//        
//        for(MatutalFund f:ml )
//        {
//        	System.out.println(f.getFund());
//        	
//        	System.out.println(f.getName());
//        }
    }
}
