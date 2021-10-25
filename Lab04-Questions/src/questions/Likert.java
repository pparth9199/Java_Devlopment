package questions;

import java.util.Objects;

/**
 * Likert questions class.
 * 
 * @author parthpatel
 *
 */
public class Likert implements Question {
  private final String questions;

  /**
   * Likert constructor.
   */
  public Likert(String questions) {
    this.questions = questions;

  }

  @Override
  public int hashCode() {
    return Objects.hash(questions);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Likert other = (Likert) obj;
    return Objects.equals(questions, other.questions);
  }

  @Override
  public int compareTo(Question o) {
    if (o instanceof TrueFalse) {
      return 1;
    } else if (o instanceof MultipleChoice) {
      return 1;
    } else if (o instanceof MultipleSelect) {
      return 1;
    } else {
      return this.questions.compareTo(o.getText());
    }
  }

  @Override
  public String answer(String answer) {
    String[] ans = answer.split(" ");
    if (ans.length == 0 || Integer.parseInt(answer) < 1 || Integer.parseInt(answer) > 5) {
      return INCORRECT;
    } else {
      return CORRECT;
    }
  }

  @Override
  public String getText() {
    return this.questions;
  }

}
