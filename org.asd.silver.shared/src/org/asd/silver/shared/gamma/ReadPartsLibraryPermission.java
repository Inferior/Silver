/**
 * 
 */
package org.asd.silver.shared.gamma;

import java.security.BasicPermission;

/**
 * @author AndrewL
 */
public class ReadPartsLibraryPermission extends BasicPermission {

  private static final long serialVersionUID = 1L;

  /**
 * 
 */
  public ReadPartsLibraryPermission() {
    super("ReadPartsLibrary");
  }
}