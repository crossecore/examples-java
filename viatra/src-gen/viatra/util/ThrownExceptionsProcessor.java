/**
 * Generated from platform:/resource/viatra/src/viatra/queries.vql
 */
package viatra.util;

import java_.TypeAccess;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import viatra.ThrownExceptionsMatch;

/**
 * A match processor tailored for the viatra.thrownExceptions pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ThrownExceptionsProcessor implements IMatchProcessor<ThrownExceptionsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pEx the value of pattern parameter Ex in the currently processed match
   * 
   */
  public abstract void process(final TypeAccess pEx);
  
  @Override
  public void process(final ThrownExceptionsMatch match) {
    process(match.getEx());
  }
}
