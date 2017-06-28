package ca.mcgill.cs.stg.jetuml.diagrams;

import static org.junit.Assert.*;

import org.junit.Test;

import ca.mcgill.cs.stg.jetuml.UMLEditor;
import ca.mcgill.cs.stg.jetuml.framework.EditorFrame;

public class TestDeploymentDiagramGraph {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreateDiagram() {
		try{
		DeploymentDiagramGraph deploy = new DeploymentDiagramGraph();
		EditorFrame ef = new EditorFrame(deploy.getClass());
		ef.save();
		}catch(Exception e){
			fail(e.getMessage());
		}
		assert(true);
	}

}
