package com.thecrunchycorner.runlogweb.week;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TotalsDaoImpl implements TotalsDao {

    private SessionFactory sessionFactory;

    @Autowired
    public void setRunlogSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @Transactional
    public List<Totals> getTotals() {
        List<Totals> listTotals = (List<Totals>) sessionFactory.getCurrentSession()
                .createCriteria(Totals.class)
                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

        return listTotals;
    }

    @Override
    @Transactional
    public void saveOrUpdate(Totals totals) {
        sessionFactory.getCurrentSession().saveOrUpdate(totals);
    }
}
