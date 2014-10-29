/**
 * 
 */
package org.asd.silver.server.gamma;

import org.asd.silver.shared.gamma.CreatePartsLibraryPermission;
import org.asd.silver.shared.gamma.IPartsLibraryService;
import org.asd.silver.shared.gamma.PartsLibraryFormData;
import org.asd.silver.shared.gamma.ReadPartsLibraryPermission;
import org.asd.silver.shared.gamma.UpdatePartsLibraryPermission;
import org.eclipse.scout.commons.exception.ProcessingException;
import org.eclipse.scout.commons.exception.VetoException;
import org.eclipse.scout.rt.shared.TEXTS;
import org.eclipse.scout.rt.shared.services.common.security.ACCESS;
import org.eclipse.scout.service.AbstractService;

/**
 * @author AndrewL
 */
public class PartsLibraryService extends AbstractService implements IPartsLibraryService {

  @Override
  public PartsLibraryFormData create(PartsLibraryFormData formData) throws ProcessingException {
    if (!ACCESS.check(new CreatePartsLibraryPermission())) {
      throw new VetoException(TEXTS.get("AuthorizationFailed"));
    }
    //TODO [AndrewL] business logic here.
    return formData;
  }

  @Override
  public PartsLibraryFormData load(PartsLibraryFormData formData) throws ProcessingException {
    if (!ACCESS.check(new ReadPartsLibraryPermission())) {
      throw new VetoException(TEXTS.get("AuthorizationFailed"));
    }
    //TODO [AndrewL] business logic here.
    return formData;
  }

  @Override
  public PartsLibraryFormData prepareCreate(PartsLibraryFormData formData) throws ProcessingException {
    if (!ACCESS.check(new CreatePartsLibraryPermission())) {
      throw new VetoException(TEXTS.get("AuthorizationFailed"));
    }
    //TODO [AndrewL] business logic here.
    return formData;
  }

  @Override
  public PartsLibraryFormData store(PartsLibraryFormData formData) throws ProcessingException {
    if (!ACCESS.check(new UpdatePartsLibraryPermission())) {
      throw new VetoException(TEXTS.get("AuthorizationFailed"));
    }
    //TODO [AndrewL] business logic here.
    return formData;
  }
}
