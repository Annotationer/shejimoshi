package main.java.com.sample;
import org.drools.runtime.rule.Activation;
import org.drools.runtime.rule.AgendaFilter;

public class TestAgendaFilter implements AgendaFilter {

	private String startName;
	
	public TestAgendaFilter(String startName) {
		super();
		this.startName = startName;
	}

	@Override
	public boolean accept(Activation activation) {
		// TODO Auto-generated method stub
		String ruleName = activation.getRule().getName();
		if(ruleName.startsWith(startName)){
			return true;
		}else
		{
			return false;
		}
	}

}
