package main.java.com.sample;

import java.util.Collection;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.QueryResult;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.impl.ClassPathResource;
import org.drools.runtime.StatefulKnowledgeSession;
import org.drools.runtime.rule.QueryResults;

public class matchesTest {

	public static void main(String[] args) {
		KnowledgeBuilder kb = KnowledgeBuilderFactory.newKnowledgeBuilder();
		//kb.add(new ClassPathResource("matches.drl"), ResourceType.DRL);
		//kb.add(new ClassPathResource("Sample2.drl"), ResourceType.DRL);
//		kb.add(new ClassPathResource("Sample3.drl"),ResourceType.DRL);
		//kb.add(new ClassPathResource("Sample4.drl"),ResourceType.DRL);
		
		//kb.add(new ClassPathResource("Sample5.drl"),ResourceType.DRL);
		//kb.add(new ClassPathResource("Sample6.drl"),ResourceType.DRL);
		kb.add(new ClassPathResource("Sample7.drl"),ResourceType.DRL);
		
		
		Collection collection = kb.getKnowledgePackages();
		KnowledgeBase knowledgebase = KnowledgeBaseFactory.newKnowledgeBase();
		
		knowledgebase.addKnowledgePackages(collection);
		
		StatefulKnowledgeSession statefulKSession = knowledgebase.newStatefulKnowledgeSession();
//		
//		Customer cust1 = new Customer();
//		cust1.setName("张三");
//		
//		Customer cust2 = new Customer();
//		cust2.setName("李四");
//		
//		Customer cust3 = new Customer();
//		cust3.setName("李而然");
//		
//		
//		statefulKSession.insert(cust1);
//		
//		statefulKSession.insert(cust2);
//		
//		statefulKSession.insert(cust3);
		
		Customer cust = new Customer();
		cust.setAge(20);
		cust.setName("张三");
		cust.setId(1);
		statefulKSession.insert(cust);
		Customer cust1 = new Customer();
		cust1.setAge(33);
		cust1.setName("张三");
		cust1.setId(55);
		statefulKSession.fireAllRules();
		
		
		//System.out.println((Customer)statefulKSession.get);
		statefulKSession.dispose();
		
		/*QueryResults qr = statefulKSession.getQueryResults("query face count",new Object());
		
		System.out.println("customer 对象数目："+ qr.size());
		*/
		System.out.println("end.....");
		
		
		
	}
}
