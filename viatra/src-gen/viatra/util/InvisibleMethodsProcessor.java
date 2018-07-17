/**
 * Generated from platform:/resource/viatra/src/viatra/queries.vql
 */
package viatra.util;

import java_.MethodDeclaration;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import viatra.InvisibleMethodsMatch;

/**
 * A match processor tailored for the viatra.invisibleMethods pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class InvisibleMethodsProcessor implements IMatchProcessor<InvisibleMethodsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pMet the value of pattern parameter Met in the currently processed match
   * 
   */
  public abstract void process(final MethodDeclaration pMet);
  
  @Override
  public void process(final InvisibleMethodsMatch match) {
    process(match.getMet());
  }
}
