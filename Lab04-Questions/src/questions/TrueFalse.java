package questions;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Class for TrueFalse.
 */

public class TrueFalse implements Question {
  private final String questions;

  private final String answer;

  /**
   * Constructor to initialize the variables of TrueFalse.
   */
  public TrueFalse(String questions, String... choices) {
    this.questions = questions;
    final ArrayList<String> choices1;
    choices1 = new ArrayList<String>();
    for (int i = 0; i < choices.length - 1; i++) {
      choices1.add(choices[i]);
    }
    this.answer = choices[choices.length - 1];
  }

  @Override
  public int hashCode() {
    return Objects.hash(answer, questions);
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
    TrueFalse other = (TrueFalse) obj;
    return Objects.equals(answer, other.answer) && Objects.equals(questions, other.questions);
  }

  @Override
  public int compareTo(Question o) {

    if (o instanceof TrueFalse) {
      return this.questions.compareTo(o.getText());
    } else if (o instanceof MultipleChoice) {
      return -1;
    } else if (o instanceof MultipleSelect) {
      return -1;
    } else {
      return -1;
    }
  }

  @Override
  public String answer(String answer) {
    if (answer == this.answer) {
      return CORRECT;
    } else {
      return INCORRECT;
    }

  }

  @Override
  public String getText() {
    return this.questions;
  }
}
