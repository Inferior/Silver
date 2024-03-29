/**
 *
 */
package org.asd.silver.server.delta;

import org.asd.silver.shared.delta.ICompanyLookupService;
import org.eclipse.scout.rt.server.services.lookup.AbstractSqlLookupService;

/**
 * @author AndrewL
 */
public class CompanyLookupService extends AbstractSqlLookupService<Long> implements ICompanyLookupService {

  @Override
  protected String getConfiguredSqlSelect() {
    return "SELECT COMPANY_ID," +
        "         COMPANY_NAMELONG" +
        " FROM COMPANY" +
        " WHERE 1=1" +
        " <key> AND COMPANY_ID = :key </key>" +
        " <text> AND COMPANY_NAMELONG LIKE :text </text>" +
        " <all> </all>";
  }
}
