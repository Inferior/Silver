/**
 * 
 */
package org.asd.silver.shared.delta;

import org.eclipse.scout.commons.annotations.Order;
import org.eclipse.scout.commons.exception.ProcessingException;
import org.eclipse.scout.rt.shared.TEXTS;
import org.eclipse.scout.rt.shared.services.common.code.AbstractCode;
import org.eclipse.scout.rt.shared.services.common.code.AbstractCodeType;

/**
 * @author AndrewL
 */
public class CompanySpecificApprovalCodeType extends AbstractCodeType<Integer, Integer> {

  private static final long serialVersionUID = 1L;
  /**
 * 
 */
  public static final Integer ID = 11000;

  /**
   * @throws org.eclipse.scout.commons.exception.ProcessingException
   */
  public CompanySpecificApprovalCodeType() throws ProcessingException {
    super();
  }

  @Override
  protected String getConfiguredText() {
    return TEXTS.get("CompanySpecificApproval");
  }

  @Override
  public Integer getId() {
    return ID;
  }

  @Order(10.0)
  public static class LockheedMartinCode extends AbstractCode<Integer> {

    private static final long serialVersionUID = 1L;
    /**
   * 
   */
    public static final Integer ID = 11001;

    @Override
    protected String getConfiguredText() {
      return TEXTS.get("LockheedMartin");
    }

    @Override
    public Integer getId() {
      return ID;
    }
  }

  @Order(20.0)
  public static class HoneywellFMTCode extends AbstractCode<Integer> {

    private static final long serialVersionUID = 1L;
    /**
   * 
   */
    public static final Integer ID = 11002;

    @Override
    protected String getConfiguredText() {
      return TEXTS.get("HoneywellFMT");
    }

    @Override
    public Integer getId() {
      return ID;
    }
  }

  @Order(30.0)
  public static class BothCode extends AbstractCode<Integer> {

    private static final long serialVersionUID = 1L;
    /**
   * 
   */
    public static final Integer ID = 11003;

    @Override
    protected String getConfiguredText() {
      return TEXTS.get("Both");
    }

    @Override
    public Integer getId() {
      return ID;
    }
  }
}
