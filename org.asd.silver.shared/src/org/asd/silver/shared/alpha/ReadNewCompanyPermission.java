/**
 * 
 */
package org.asd.silver.shared.alpha;

import java.security.BasicPermission;

/**
 * @author AndrewL
 */
public class ReadNewCompanyPermission extends BasicPermission {

  private static final long serialVersionUID = 1L;

  /**
 * 
 */
  public ReadNewCompanyPermission() {
    super("ReadNewCompany");
  }
}
