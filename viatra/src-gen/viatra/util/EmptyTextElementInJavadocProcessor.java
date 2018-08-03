/**
 * Generated from platform:/resource/viatra/src/viatra/queries.vql
 */
package viatra.util;

import java_.TextElement;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import viatra.EmptyTextElementInJavadocMatch;

/**
 * A match processor tailored for the viatra.emptyTextElementInJavadoc pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class EmptyTextElementInJavadocProcessor implements IMatchProcessor<EmptyTextElementInJavadocMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pFf the value of pattern parameter Ff in the currently processed match
   * 
   */
  public abstract void process(final TextElement pFf);
  
  @Override
  public void process(final EmptyTextElementInJavadocMatch match) {
    process(match.getFf());
  }
}
