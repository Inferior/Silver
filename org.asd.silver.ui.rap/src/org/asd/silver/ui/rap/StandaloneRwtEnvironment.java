package org.asd.silver.ui.rap;

import org.asd.silver.client.ClientSession;
import org.eclipse.scout.rt.ui.rap.AbstractStandaloneRwtEnvironment;

public class StandaloneRwtEnvironment extends AbstractStandaloneRwtEnvironment {

  public StandaloneRwtEnvironment() {
    super(Activator.getDefault().getBundle(), ClientSession.class);
  }
}
