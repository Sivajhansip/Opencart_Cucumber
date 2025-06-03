package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		 //features={".//Features/login1.feature"},
		// features={".//Features/Registration.feature"},
		//features= {".//Features/"},
		//features= {".//Features/login1.feature"},
		//features= {".//Features/Registration.feature"},

		//features= {".//Features/LoginDDTExcel.feature"},
		features= {".//Features/login1.feature",".//Features/Registration.feature"},
		//features= {"@target/rerun.txt"},
		 glue= {"stepDefinations","hooks"},
		 plugin= {
				 "pretty", "html:reports/myreport.html",   //junit report
				 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",//extent report
				 "rerun:target/rerun.txt",  //failed test cases rerun(failures are captured here
		    },
		 dryRun=false,     // checks mapping between scenario steps and step definition methods
		 monochrome=true,  // to avoid junk characters in output
		 publish=true,      // to publish report in cucumber server
		 tags="@sanity"  // this will execute scenarios tagged with @sanity
		//tags="@regression"
		//tags="@sanity and @regression" //Scenarios tagged with both @sanity and @regression
		//tags="@sanity and not @regression" //Scenarios tagged with @sanity but not tagged with @regression
		//tags="@sanity or @regression" //Scenarios tagged with either @sanity or @regression
		)
public class TestRunner {

}
