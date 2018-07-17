/**
 * Generated from platform:/resource/viatra/src/viatra/queries.vql
 */
package viatra.util;

import java_.TextElement;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import viatra.TextElementInJavadocMatch;

/**
 * A match processor tailored for the viatra.textElementInJavadoc pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class TextElementInJavadocProcessor implements IMatchProcessor<TextElementInJavadocMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pFf the value of pattern parameter Ff in the currently processed match
   * 
   */
  public abstract void process(final TextElement pFf);
  
  @Override
  public void process(final TextElementInJavadocMatch match) {
    process(match.getFf());
  }
}
