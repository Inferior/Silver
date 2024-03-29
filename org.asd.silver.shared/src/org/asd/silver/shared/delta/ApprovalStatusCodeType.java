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
public class ApprovalStatusCodeType extends AbstractCodeType<Integer, Integer> {

  private static final long serialVersionUID = 1L;
  /**
 * 
 */
  public static final Integer ID = 15100;

  /**
   * @throws org.eclipse.scout.commons.exception.ProcessingException
   */
  public ApprovalStatusCodeType() throws ProcessingException {
    super();
  }

  @Override
  protected String getConfiguredText() {
    return TEXTS.get("ApprovalStatus");
  }

  @Override
  public Integer getId() {
    return ID;
  }

  @Order(10.0)
  public static class ApprovedCode extends AbstractCode<Integer> {

    private static final long serialVersionUID = 1L;
    /**
   * 
   */
    public static final Integer ID = 15101;

    @Override
    protected String getConfiguredText() {
      return TEXTS.get("Approved");
    }

    @Override
    public Integer getId() {
      return ID;
    }
  }

  @Order(20.0)
  public static class ExpiredCode extends AbstractCode<Integer> {

    private static final long serialVersionUID = 1L;
    /**
   * 
   */
    public static final Integer ID = 15102;

    @Override
    protected String getConfiguredText() {
      return TEXTS.get("Expired");
    }

    @Override
    public Integer getId() {
      return ID;
    }
  }

  @Order(30.0)
  public static class TerminatedCode extends AbstractCode<Integer> {

    private static final long serialVersionUID = 1L;
    /**
   * 
   */
    public static final Integer ID = 15103;

    @Override
    protected String getConfiguredText() {
      return TEXTS.get("Terminated");
    }

    @Override
    public Integer getId() {
      return ID;
    }
  }
}
