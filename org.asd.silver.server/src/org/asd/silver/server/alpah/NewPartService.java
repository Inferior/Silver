/**
 *
 */
package org.asd.silver.server.alpah;

import org.asd.silver.shared.alpah.CreateNewPartPermission;
import org.asd.silver.shared.alpah.INewPartService;
import org.asd.silver.shared.alpah.NewPartFormData;
import org.asd.silver.shared.alpah.ReadNewPartPermission;
import org.asd.silver.shared.alpah.UpdateNewPartPermission;
import org.eclipse.scout.commons.exception.ProcessingException;
import org.eclipse.scout.commons.exception.VetoException;
import org.eclipse.scout.rt.server.services.common.jdbc.SQL;
import org.eclipse.scout.rt.shared.TEXTS;
import org.eclipse.scout.rt.shared.services.common.security.ACCESS;
import org.eclipse.scout.service.AbstractService;

/**
 * @author AndrewL
 */
public class NewPartService extends AbstractService implements INewPartService {

  @Override
  public NewPartFormData create(NewPartFormData formData) throws ProcessingException {
    if (!ACCESS.check(new CreateNewPartPermission())) {
      throw new VetoException(TEXTS.get("AuthorizationFailed"));
    }
    SQL.insert("" +
        "INSERT INTO PART (PART_NUMBER, PART_NAME, PART_STATUS, PART_COMMON, PROGRAM_ID, DIVISION_ID, COMPANY_ID) " +
        "VALUES (:partNumber, :name, :quoteOnly, :common, :program, :division, :company)", formData);
    return formData;
  }

  @Override
  public NewPartFormData load(NewPartFormData formData) throws ProcessingException {
    if (!ACCESS.check(new ReadNewPartPermission())) {
      throw new VetoException(TEXTS.get("AuthorizationFailed"));
    }
    //TODO [AndrewL] business logic here.
    return formData;
  }

  @Override
  public NewPartFormData prepareCreate(NewPartFormData formData) throws ProcessingException {
    if (!ACCESS.check(new CreateNewPartPermission())) {
      throw new VetoException(TEXTS.get("AuthorizationFailed"));
    }
    //TODO [AndrewL] business logic here.
    return formData;
  }

  @Override
  public NewPartFormData store(NewPartFormData formData) throws ProcessingException {
    if (!ACCESS.check(new UpdateNewPartPermission())) {
      throw new VetoException(TEXTS.get("AuthorizationFailed"));
    }
    //TODO [AndrewL] business logic here.
    return formData;
  }
}
