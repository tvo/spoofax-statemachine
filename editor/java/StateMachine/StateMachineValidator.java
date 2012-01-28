package StateMachine;

import org.strategoxt.imp.runtime.dynamicloading.Descriptor;
import org.strategoxt.imp.runtime.services.MetaFileLanguageValidator;

public class StateMachineValidator extends MetaFileLanguageValidator 
{ 
  @Override public Descriptor getDescriptor()
  { 
    return StateMachineParseController.getDescriptor();
  }
}