/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.userstory.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.userstory.services.UserStoryGrammarAccess;
import org.xtext.example.userstory.userStory.Backlog;
import org.xtext.example.userstory.userStory.Role;
import org.xtext.example.userstory.userStory.Us;
import org.xtext.example.userstory.userStory.UserStoryPackage;
import org.xtext.example.userstory.userStory.usArtifact;
import org.xtext.example.userstory.userStory.usEvent;
import org.xtext.example.userstory.userStory.usTask;

@SuppressWarnings("all")
public class UserStorySemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private UserStoryGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == UserStoryPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case UserStoryPackage.BACKLOG:
				sequence_Backlog(context, (Backlog) semanticObject); 
				return; 
			case UserStoryPackage.ROLE:
				sequence_Role(context, (Role) semanticObject); 
				return; 
			case UserStoryPackage.US:
				sequence_Us(context, (Us) semanticObject); 
				return; 
			case UserStoryPackage.US_ARTIFACT:
				sequence_usArtifact(context, (usArtifact) semanticObject); 
				return; 
			case UserStoryPackage.US_EVENT:
				sequence_usEvent(context, (usEvent) semanticObject); 
				return; 
			case UserStoryPackage.US_TASK:
				sequence_usTask(context, (usTask) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Backlog returns Backlog
	 *
	 * Constraint:
	 *     (name=STRING backlog+=Us*)
	 */
	protected void sequence_Backlog(ISerializationContext context, Backlog semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Role returns Role
	 *
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_Role(ISerializationContext context, Role semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UserStoryPackage.Literals.ROLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UserStoryPackage.Literals.ROLE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRoleAccess().getNameSTRINGTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Us returns Us
	 *
	 * Constraint:
	 *     (
	 *         id=INT 
	 *         titre=STRING? 
	 *         role=Role 
	 *         activity=usActivity 
	 *         (artifact=usArtifact otherArtifact=usArtifact*)? 
	 *         (Event=usEvent otherEvent=usEvent*)? 
	 *         activity1=[usActivity|ID]? 
	 *         Event=usEvent?
	 *     )
	 */
	protected void sequence_Us(ISerializationContext context, Us semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     usArtifact returns usArtifact
	 *
	 * Constraint:
	 *     (id=INT name=STRING type=ArtifactType)
	 */
	protected void sequence_usArtifact(ISerializationContext context, usArtifact semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UserStoryPackage.Literals.US_ARTIFACT__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UserStoryPackage.Literals.US_ARTIFACT__ID));
			if (transientValues.isValueTransient(semanticObject, UserStoryPackage.Literals.US_ARTIFACT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UserStoryPackage.Literals.US_ARTIFACT__NAME));
			if (transientValues.isValueTransient(semanticObject, UserStoryPackage.Literals.US_ARTIFACT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UserStoryPackage.Literals.US_ARTIFACT__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUsArtifactAccess().getIdINTTerminalRuleCall_0_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getUsArtifactAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getUsArtifactAccess().getTypeArtifactTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     usActivity returns usEvent
	 *     usEvent returns usEvent
	 *
	 * Constraint:
	 *     (id=INT name=STRING type=INT)
	 */
	protected void sequence_usEvent(ISerializationContext context, usEvent semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UserStoryPackage.Literals.US_ACTIVITY__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UserStoryPackage.Literals.US_ACTIVITY__ID));
			if (transientValues.isValueTransient(semanticObject, UserStoryPackage.Literals.US_ACTIVITY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UserStoryPackage.Literals.US_ACTIVITY__NAME));
			if (transientValues.isValueTransient(semanticObject, UserStoryPackage.Literals.US_EVENT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UserStoryPackage.Literals.US_EVENT__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUsEventAccess().getIdINTTerminalRuleCall_0_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getUsEventAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getUsEventAccess().getTypeINTTerminalRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     usActivity returns usTask
	 *     usTask returns usTask
	 *
	 * Constraint:
	 *     (id=INT name=STRING)
	 */
	protected void sequence_usTask(ISerializationContext context, usTask semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UserStoryPackage.Literals.US_ACTIVITY__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UserStoryPackage.Literals.US_ACTIVITY__ID));
			if (transientValues.isValueTransient(semanticObject, UserStoryPackage.Literals.US_ACTIVITY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UserStoryPackage.Literals.US_ACTIVITY__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUsTaskAccess().getIdINTTerminalRuleCall_0_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getUsTaskAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}