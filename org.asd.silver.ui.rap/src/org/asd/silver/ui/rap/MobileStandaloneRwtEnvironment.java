package org.asd.silver.ui.rap;

import org.asd.silver.client.ClientSession;
import org.eclipse.scout.rt.ui.rap.mobile.AbstractMobileStandaloneRwtEnvironment;

public class MobileStandaloneRwtEnvironment extends AbstractMobileStandaloneRwtEnvironment {

  public MobileStandaloneRwtEnvironment() {
    super(Activator.getDefault().getBundle(), ClientSession.class);
  }
}
