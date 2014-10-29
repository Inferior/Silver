/**
 * 
 */
package org.asd.silver.shared.alpha;

import java.security.BasicPermission;

/**
 * @author AndrewL
 */
public class CreateNewCompanyPermission extends BasicPermission {

  private static final long serialVersionUID = 1L;

  /**
 * 
 */
  public CreateNewCompanyPermission() {
    super("CreateNewCompany");
  }
}
