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
public class CompanyApprovalCodeType extends AbstractCodeType<Integer, Integer> {

  private static final long serialVersionUID = 1L;
  /**
 * 
 */
  public static final Integer ID = 16000;

  /**
   * @throws org.eclipse.scout.commons.exception.ProcessingException
   */
  public CompanyApprovalCodeType() throws ProcessingException {
    super();
  }

  @Override
  protected String getConfiguredText() {
    return TEXTS.get("CompanyApproval");
  }

  @Override
  public Integer getId() {
    return ID;
  }

  @Order(10.0)
  public static class Tier1Code extends AbstractCode<Integer> {

    private static final long serialVersionUID = 1L;
    /**
   * 
   */
    public static final Integer ID = 16001;

    @Override
    protected String getConfiguredText() {
      return TEXTS.get("Tier1");
    }

    @Override
    public Integer getId() {
      return ID;
    }
  }

  @Order(20.0)
  public static class Tier2Code extends AbstractCode<Integer> {

    private static final long serialVersionUID = 1L;
    /**
   * 
   */
    public static final Integer ID = 16002;

    @Override
    protected String getConfiguredText() {
      return TEXTS.get("Tier2");
    }

    @Override
    public Integer getId() {
      return ID;
    }
  }

  @Order(30.0)
  public static class Tier3Code extends AbstractCode<Integer> {

    private static final long serialVersionUID = 1L;
    /**
   * 
   */
    public static final Integer ID = 16003;

    @Override
    protected String getConfiguredText() {
      return TEXTS.get("Tier3");
    }

    @Override
    public Integer getId() {
      return ID;
    }
  }

  @Order(40.0)
  public static class Tier4Code extends AbstractCode<Integer> {

    private static final long serialVersionUID = 1L;
    /**
   * 
   */
    public static final Integer ID = 16004;

    @Override
    protected String getConfiguredText() {
      return TEXTS.get("Tier4");
    }

    @Override
    public Integer getId() {
      return ID;
    }
  }

  @Order(50.0)
  public static class NACode extends AbstractCode<Integer> {

    private static final long serialVersionUID = 1L;
    /**
   * 
   */
    public static final Integer ID = 16005;

    @Override
    protected String getConfiguredText() {
      return TEXTS.get("NA");
    }

    @Override
    public Integer getId() {
      return ID;
    }
  }
}
