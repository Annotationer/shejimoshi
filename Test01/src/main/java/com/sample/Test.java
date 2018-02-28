package main.java.com.sample;

import java.util.Collection;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.impl.ClassPathResource;
import org.drools.runtime.StatefulKnowledgeSession;
import org.drools.runtime.rule.AgendaFilter;
import org.drools.runtime.rule.QueryResults;
import org.drools.runtime.rule.QueryResultsRow;

public class Test {
	public static void main(String[] args) {
//		KnowledgeBuilder kb = KnowledgeBuilderFactory.newKnowledgeBuilder();
//		kb.add(new ClassPathResource("Sample11.drl"), ResourceType.DRL);
//		Collection collection  = kb.getKnowledgePackages();
//		KnowledgeBase knowledgeBase = KnowledgeBaseFactory.newKnowledgeBase();
//		knowledgeBase.addKnowledgePackages(collection);
//		StatefulKnowledgeSession statefulKSession = knowledgeBase.newStatefulKnowledgeSession();
//		//statefulKSession.getAgenda().getAgendaGroup("002").setFocus();
//		AgendaFilter filter = new TestAgendaFilter("rule1");
//		
//		statefulKSession.fireAllRules(filter);
//		statefulKSession.dispose();
//		
//		
		
		
		KnowledgeBuilder kb = KnowledgeBuilderFactory.newKnowledgeBuilder();
		kb.add(new ClassPathResource("Sample12.drl"), ResourceType.DRL);
		Collection collection  = kb.getKnowledgePackages();
		KnowledgeBase knowledgeBase = KnowledgeBaseFactory.newKnowledgeBase();
		knowledgeBase.addKnowledgePackages(collection);
		StatefulKnowledgeSession statefulKSession = knowledgeBase.newStatefulKnowledgeSession();
		//statefulKSession.getAgenda().getAgendaGroup("002").setFocus();
		//AgendaFilter filter = new TestAgendaFilter("rule1");
		
		statefulKSession.insert(new Customer("a",33,1));
		statefulKSession.insert(new Customer("b",22,1));
		
		QueryResults qr = statefulKSession.getQueryResults("testQuery");
		for(QueryResultsRow q :qr){
			Customer cust = (Customer) q.get("cust1");
			System.out.println(cust.getName() + "---" + cust.getAge());
		}
		
		//statefulKSession.fireAllRules();
		statefulKSession.dispose();
		
	}
}
