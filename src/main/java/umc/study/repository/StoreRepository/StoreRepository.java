package umc.study.repository.StoreRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.study.domain.Store;

public interface StoreRepository extends JpaRepository<Store, Long>, StoreRepositoryCustom {
}
