/**
 * Generated from platform:/resource/viatra/src/viatra/queries.vql
 */
package viatra.util;

import java_.TypeDeclaration;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import viatra.Grabats09Match;

/**
 * A match processor tailored for the viatra.grabats09 pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class Grabats09Processor implements IMatchProcessor<Grabats09Match> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTt the value of pattern parameter Tt in the currently processed match
   * 
   */
  public abstract void process(final TypeDeclaration pTt);
  
  @Override
  public void process(final Grabats09Match match) {
    process(match.getTt());
  }
}
