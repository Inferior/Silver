/**
 *
 */
package org.asd.silver.server.delta;

import org.asd.silver.shared.delta.IDivisionLookupService;
import org.eclipse.scout.rt.server.services.lookup.AbstractSqlLookupService;

/**
 * @author AndrewL
 */
public class DivisionLookupService extends AbstractSqlLookupService<Long> implements IDivisionLookupService {

  @Override
  protected String getConfiguredSqlSelect() {
    return "SELECT DIVISION_ID," +
        "         DIVISION_NAME" +
        " FROM DIVISION" +
        " WHERE 1=1" +
        " AND COMPANY_COMPANY_ID = :master " +
        " <key> AND DIVISION_ID = :key </key>" +
        " <text> AND DIVISION_NAME LIKE :text </text>" +
        " <all> </all>";

  }
}
