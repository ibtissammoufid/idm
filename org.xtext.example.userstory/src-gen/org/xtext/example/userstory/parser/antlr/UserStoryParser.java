/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.userstory.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.userstory.parser.antlr.internal.InternalUserStoryParser;
import org.xtext.example.userstory.services.UserStoryGrammarAccess;

public class UserStoryParser extends AbstractAntlrParser {

	@Inject
	private UserStoryGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalUserStoryParser createParser(XtextTokenStream stream) {
		return new InternalUserStoryParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Backlog";
	}

	public UserStoryGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(UserStoryGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
