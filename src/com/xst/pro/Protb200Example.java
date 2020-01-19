package com.xst.pro;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Protb200Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Protb200Example() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andProtb200idIsNull() {
            addCriterion("PROTB200ID is null");
            return (Criteria) this;
        }

        public Criteria andProtb200idIsNotNull() {
            addCriterion("PROTB200ID is not null");
            return (Criteria) this;
        }

        public Criteria andProtb200idEqualTo(String value) {
            addCriterion("PROTB200ID =", value, "protb200id");
            return (Criteria) this;
        }

        public Criteria andProtb200idNotEqualTo(String value) {
            addCriterion("PROTB200ID <>", value, "protb200id");
            return (Criteria) this;
        }

        public Criteria andProtb200idGreaterThan(String value) {
            addCriterion("PROTB200ID >", value, "protb200id");
            return (Criteria) this;
        }

        public Criteria andProtb200idGreaterThanOrEqualTo(String value) {
            addCriterion("PROTB200ID >=", value, "protb200id");
            return (Criteria) this;
        }

        public Criteria andProtb200idLessThan(String value) {
            addCriterion("PROTB200ID <", value, "protb200id");
            return (Criteria) this;
        }

        public Criteria andProtb200idLessThanOrEqualTo(String value) {
            addCriterion("PROTB200ID <=", value, "protb200id");
            return (Criteria) this;
        }

        public Criteria andProtb200idLike(String value) {
            addCriterion("PROTB200ID like", value, "protb200id");
            return (Criteria) this;
        }

        public Criteria andProtb200idNotLike(String value) {
            addCriterion("PROTB200ID not like", value, "protb200id");
            return (Criteria) this;
        }

        public Criteria andProtb200idIn(List<String> values) {
            addCriterion("PROTB200ID in", values, "protb200id");
            return (Criteria) this;
        }

        public Criteria andProtb200idNotIn(List<String> values) {
            addCriterion("PROTB200ID not in", values, "protb200id");
            return (Criteria) this;
        }

        public Criteria andProtb200idBetween(String value1, String value2) {
            addCriterion("PROTB200ID between", value1, value2, "protb200id");
            return (Criteria) this;
        }

        public Criteria andProtb200idNotBetween(String value1, String value2) {
            addCriterion("PROTB200ID not between", value1, value2, "protb200id");
            return (Criteria) this;
        }

        public Criteria andProtb200cd01IsNull() {
            addCriterion("PROTB200CD01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb200cd01IsNotNull() {
            addCriterion("PROTB200CD01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb200cd01EqualTo(String value) {
            addCriterion("PROTB200CD01 =", value, "protb200cd01");
            return (Criteria) this;
        }

        public Criteria andProtb200cd01NotEqualTo(String value) {
            addCriterion("PROTB200CD01 <>", value, "protb200cd01");
            return (Criteria) this;
        }

        public Criteria andProtb200cd01GreaterThan(String value) {
            addCriterion("PROTB200CD01 >", value, "protb200cd01");
            return (Criteria) this;
        }

        public Criteria andProtb200cd01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB200CD01 >=", value, "protb200cd01");
            return (Criteria) this;
        }

        public Criteria andProtb200cd01LessThan(String value) {
            addCriterion("PROTB200CD01 <", value, "protb200cd01");
            return (Criteria) this;
        }

        public Criteria andProtb200cd01LessThanOrEqualTo(String value) {
            addCriterion("PROTB200CD01 <=", value, "protb200cd01");
            return (Criteria) this;
        }

        public Criteria andProtb200cd01Like(String value) {
            addCriterion("PROTB200CD01 like", value, "protb200cd01");
            return (Criteria) this;
        }

        public Criteria andProtb200cd01NotLike(String value) {
            addCriterion("PROTB200CD01 not like", value, "protb200cd01");
            return (Criteria) this;
        }

        public Criteria andProtb200cd01In(List<String> values) {
            addCriterion("PROTB200CD01 in", values, "protb200cd01");
            return (Criteria) this;
        }

        public Criteria andProtb200cd01NotIn(List<String> values) {
            addCriterion("PROTB200CD01 not in", values, "protb200cd01");
            return (Criteria) this;
        }

        public Criteria andProtb200cd01Between(String value1, String value2) {
            addCriterion("PROTB200CD01 between", value1, value2, "protb200cd01");
            return (Criteria) this;
        }

        public Criteria andProtb200cd01NotBetween(String value1, String value2) {
            addCriterion("PROTB200CD01 not between", value1, value2, "protb200cd01");
            return (Criteria) this;
        }

        public Criteria andSettb03idIsNull() {
            addCriterion("SETTB03ID is null");
            return (Criteria) this;
        }

        public Criteria andSettb03idIsNotNull() {
            addCriterion("SETTB03ID is not null");
            return (Criteria) this;
        }

        public Criteria andSettb03idEqualTo(String value) {
            addCriterion("SETTB03ID =", value, "settb03id");
            return (Criteria) this;
        }

        public Criteria andSettb03idNotEqualTo(String value) {
            addCriterion("SETTB03ID <>", value, "settb03id");
            return (Criteria) this;
        }

        public Criteria andSettb03idGreaterThan(String value) {
            addCriterion("SETTB03ID >", value, "settb03id");
            return (Criteria) this;
        }

        public Criteria andSettb03idGreaterThanOrEqualTo(String value) {
            addCriterion("SETTB03ID >=", value, "settb03id");
            return (Criteria) this;
        }

        public Criteria andSettb03idLessThan(String value) {
            addCriterion("SETTB03ID <", value, "settb03id");
            return (Criteria) this;
        }

        public Criteria andSettb03idLessThanOrEqualTo(String value) {
            addCriterion("SETTB03ID <=", value, "settb03id");
            return (Criteria) this;
        }

        public Criteria andSettb03idLike(String value) {
            addCriterion("SETTB03ID like", value, "settb03id");
            return (Criteria) this;
        }

        public Criteria andSettb03idNotLike(String value) {
            addCriterion("SETTB03ID not like", value, "settb03id");
            return (Criteria) this;
        }

        public Criteria andSettb03idIn(List<String> values) {
            addCriterion("SETTB03ID in", values, "settb03id");
            return (Criteria) this;
        }

        public Criteria andSettb03idNotIn(List<String> values) {
            addCriterion("SETTB03ID not in", values, "settb03id");
            return (Criteria) this;
        }

        public Criteria andSettb03idBetween(String value1, String value2) {
            addCriterion("SETTB03ID between", value1, value2, "settb03id");
            return (Criteria) this;
        }

        public Criteria andSettb03idNotBetween(String value1, String value2) {
            addCriterion("SETTB03ID not between", value1, value2, "settb03id");
            return (Criteria) this;
        }

        public Criteria andProtb102idIsNull() {
            addCriterion("PROTB102ID is null");
            return (Criteria) this;
        }

        public Criteria andProtb102idIsNotNull() {
            addCriterion("PROTB102ID is not null");
            return (Criteria) this;
        }

        public Criteria andProtb102idEqualTo(String value) {
            addCriterion("PROTB102ID =", value, "protb102id");
            return (Criteria) this;
        }

        public Criteria andProtb102idNotEqualTo(String value) {
            addCriterion("PROTB102ID <>", value, "protb102id");
            return (Criteria) this;
        }

        public Criteria andProtb102idGreaterThan(String value) {
            addCriterion("PROTB102ID >", value, "protb102id");
            return (Criteria) this;
        }

        public Criteria andProtb102idGreaterThanOrEqualTo(String value) {
            addCriterion("PROTB102ID >=", value, "protb102id");
            return (Criteria) this;
        }

        public Criteria andProtb102idLessThan(String value) {
            addCriterion("PROTB102ID <", value, "protb102id");
            return (Criteria) this;
        }

        public Criteria andProtb102idLessThanOrEqualTo(String value) {
            addCriterion("PROTB102ID <=", value, "protb102id");
            return (Criteria) this;
        }

        public Criteria andProtb102idLike(String value) {
            addCriterion("PROTB102ID like", value, "protb102id");
            return (Criteria) this;
        }

        public Criteria andProtb102idNotLike(String value) {
            addCriterion("PROTB102ID not like", value, "protb102id");
            return (Criteria) this;
        }

        public Criteria andProtb102idIn(List<String> values) {
            addCriterion("PROTB102ID in", values, "protb102id");
            return (Criteria) this;
        }

        public Criteria andProtb102idNotIn(List<String> values) {
            addCriterion("PROTB102ID not in", values, "protb102id");
            return (Criteria) this;
        }

        public Criteria andProtb102idBetween(String value1, String value2) {
            addCriterion("PROTB102ID between", value1, value2, "protb102id");
            return (Criteria) this;
        }

        public Criteria andProtb102idNotBetween(String value1, String value2) {
            addCriterion("PROTB102ID not between", value1, value2, "protb102id");
            return (Criteria) this;
        }

        public Criteria andProtb200ca00IsNull() {
            addCriterion("PROTB200CA00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb200ca00IsNotNull() {
            addCriterion("PROTB200CA00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb200ca00EqualTo(Date value) {
            addCriterionForJDBCDate("PROTB200CA00 =", value, "protb200ca00");
            return (Criteria) this;
        }

        public Criteria andProtb200ca00NotEqualTo(Date value) {
            addCriterionForJDBCDate("PROTB200CA00 <>", value, "protb200ca00");
            return (Criteria) this;
        }

        public Criteria andProtb200ca00GreaterThan(Date value) {
            addCriterionForJDBCDate("PROTB200CA00 >", value, "protb200ca00");
            return (Criteria) this;
        }

        public Criteria andProtb200ca00GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PROTB200CA00 >=", value, "protb200ca00");
            return (Criteria) this;
        }

        public Criteria andProtb200ca00LessThan(Date value) {
            addCriterionForJDBCDate("PROTB200CA00 <", value, "protb200ca00");
            return (Criteria) this;
        }

        public Criteria andProtb200ca00LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PROTB200CA00 <=", value, "protb200ca00");
            return (Criteria) this;
        }

        public Criteria andProtb200ca00In(List<Date> values) {
            addCriterionForJDBCDate("PROTB200CA00 in", values, "protb200ca00");
            return (Criteria) this;
        }

        public Criteria andProtb200ca00NotIn(List<Date> values) {
            addCriterionForJDBCDate("PROTB200CA00 not in", values, "protb200ca00");
            return (Criteria) this;
        }

        public Criteria andProtb200ca00Between(Date value1, Date value2) {
            addCriterionForJDBCDate("PROTB200CA00 between", value1, value2, "protb200ca00");
            return (Criteria) this;
        }

        public Criteria andProtb200ca00NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PROTB200CA00 not between", value1, value2, "protb200ca00");
            return (Criteria) this;
        }

        public Criteria andProtb200ca01IsNull() {
            addCriterion("PROTB200CA01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb200ca01IsNotNull() {
            addCriterion("PROTB200CA01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb200ca01EqualTo(Date value) {
            addCriterion("PROTB200CA01 =", value, "protb200ca01");
            return (Criteria) this;
        }

        public Criteria andProtb200ca01NotEqualTo(Date value) {
            addCriterion("PROTB200CA01 <>", value, "protb200ca01");
            return (Criteria) this;
        }

        public Criteria andProtb200ca01GreaterThan(Date value) {
            addCriterion("PROTB200CA01 >", value, "protb200ca01");
            return (Criteria) this;
        }

        public Criteria andProtb200ca01GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB200CA01 >=", value, "protb200ca01");
            return (Criteria) this;
        }

        public Criteria andProtb200ca01LessThan(Date value) {
            addCriterion("PROTB200CA01 <", value, "protb200ca01");
            return (Criteria) this;
        }

        public Criteria andProtb200ca01LessThanOrEqualTo(Date value) {
            addCriterion("PROTB200CA01 <=", value, "protb200ca01");
            return (Criteria) this;
        }

        public Criteria andProtb200ca01In(List<Date> values) {
            addCriterion("PROTB200CA01 in", values, "protb200ca01");
            return (Criteria) this;
        }

        public Criteria andProtb200ca01NotIn(List<Date> values) {
            addCriterion("PROTB200CA01 not in", values, "protb200ca01");
            return (Criteria) this;
        }

        public Criteria andProtb200ca01Between(Date value1, Date value2) {
            addCriterion("PROTB200CA01 between", value1, value2, "protb200ca01");
            return (Criteria) this;
        }

        public Criteria andProtb200ca01NotBetween(Date value1, Date value2) {
            addCriterion("PROTB200CA01 not between", value1, value2, "protb200ca01");
            return (Criteria) this;
        }

        public Criteria andProtb200ca02IsNull() {
            addCriterion("PROTB200CA02 is null");
            return (Criteria) this;
        }

        public Criteria andProtb200ca02IsNotNull() {
            addCriterion("PROTB200CA02 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb200ca02EqualTo(Date value) {
            addCriterion("PROTB200CA02 =", value, "protb200ca02");
            return (Criteria) this;
        }

        public Criteria andProtb200ca02NotEqualTo(Date value) {
            addCriterion("PROTB200CA02 <>", value, "protb200ca02");
            return (Criteria) this;
        }

        public Criteria andProtb200ca02GreaterThan(Date value) {
            addCriterion("PROTB200CA02 >", value, "protb200ca02");
            return (Criteria) this;
        }

        public Criteria andProtb200ca02GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB200CA02 >=", value, "protb200ca02");
            return (Criteria) this;
        }

        public Criteria andProtb200ca02LessThan(Date value) {
            addCriterion("PROTB200CA02 <", value, "protb200ca02");
            return (Criteria) this;
        }

        public Criteria andProtb200ca02LessThanOrEqualTo(Date value) {
            addCriterion("PROTB200CA02 <=", value, "protb200ca02");
            return (Criteria) this;
        }

        public Criteria andProtb200ca02In(List<Date> values) {
            addCriterion("PROTB200CA02 in", values, "protb200ca02");
            return (Criteria) this;
        }

        public Criteria andProtb200ca02NotIn(List<Date> values) {
            addCriterion("PROTB200CA02 not in", values, "protb200ca02");
            return (Criteria) this;
        }

        public Criteria andProtb200ca02Between(Date value1, Date value2) {
            addCriterion("PROTB200CA02 between", value1, value2, "protb200ca02");
            return (Criteria) this;
        }

        public Criteria andProtb200ca02NotBetween(Date value1, Date value2) {
            addCriterion("PROTB200CA02 not between", value1, value2, "protb200ca02");
            return (Criteria) this;
        }

        public Criteria andProtb200ca03IsNull() {
            addCriterion("PROTB200CA03 is null");
            return (Criteria) this;
        }

        public Criteria andProtb200ca03IsNotNull() {
            addCriterion("PROTB200CA03 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb200ca03EqualTo(Double value) {
            addCriterion("PROTB200CA03 =", value, "protb200ca03");
            return (Criteria) this;
        }

        public Criteria andProtb200ca03NotEqualTo(Double value) {
            addCriterion("PROTB200CA03 <>", value, "protb200ca03");
            return (Criteria) this;
        }

        public Criteria andProtb200ca03GreaterThan(Double value) {
            addCriterion("PROTB200CA03 >", value, "protb200ca03");
            return (Criteria) this;
        }

        public Criteria andProtb200ca03GreaterThanOrEqualTo(Double value) {
            addCriterion("PROTB200CA03 >=", value, "protb200ca03");
            return (Criteria) this;
        }

        public Criteria andProtb200ca03LessThan(Double value) {
            addCriterion("PROTB200CA03 <", value, "protb200ca03");
            return (Criteria) this;
        }

        public Criteria andProtb200ca03LessThanOrEqualTo(Double value) {
            addCriterion("PROTB200CA03 <=", value, "protb200ca03");
            return (Criteria) this;
        }

        public Criteria andProtb200ca03In(List<Double> values) {
            addCriterion("PROTB200CA03 in", values, "protb200ca03");
            return (Criteria) this;
        }

        public Criteria andProtb200ca03NotIn(List<Double> values) {
            addCriterion("PROTB200CA03 not in", values, "protb200ca03");
            return (Criteria) this;
        }

        public Criteria andProtb200ca03Between(Double value1, Double value2) {
            addCriterion("PROTB200CA03 between", value1, value2, "protb200ca03");
            return (Criteria) this;
        }

        public Criteria andProtb200ca03NotBetween(Double value1, Double value2) {
            addCriterion("PROTB200CA03 not between", value1, value2, "protb200ca03");
            return (Criteria) this;
        }

        public Criteria andProtb200ca04IsNull() {
            addCriterion("PROTB200CA04 is null");
            return (Criteria) this;
        }

        public Criteria andProtb200ca04IsNotNull() {
            addCriterion("PROTB200CA04 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb200ca04EqualTo(Integer value) {
            addCriterion("PROTB200CA04 =", value, "protb200ca04");
            return (Criteria) this;
        }

        public Criteria andProtb200ca04NotEqualTo(Integer value) {
            addCriterion("PROTB200CA04 <>", value, "protb200ca04");
            return (Criteria) this;
        }

        public Criteria andProtb200ca04GreaterThan(Integer value) {
            addCriterion("PROTB200CA04 >", value, "protb200ca04");
            return (Criteria) this;
        }

        public Criteria andProtb200ca04GreaterThanOrEqualTo(Integer value) {
            addCriterion("PROTB200CA04 >=", value, "protb200ca04");
            return (Criteria) this;
        }

        public Criteria andProtb200ca04LessThan(Integer value) {
            addCriterion("PROTB200CA04 <", value, "protb200ca04");
            return (Criteria) this;
        }

        public Criteria andProtb200ca04LessThanOrEqualTo(Integer value) {
            addCriterion("PROTB200CA04 <=", value, "protb200ca04");
            return (Criteria) this;
        }

        public Criteria andProtb200ca04In(List<Integer> values) {
            addCriterion("PROTB200CA04 in", values, "protb200ca04");
            return (Criteria) this;
        }

        public Criteria andProtb200ca04NotIn(List<Integer> values) {
            addCriterion("PROTB200CA04 not in", values, "protb200ca04");
            return (Criteria) this;
        }

        public Criteria andProtb200ca04Between(Integer value1, Integer value2) {
            addCriterion("PROTB200CA04 between", value1, value2, "protb200ca04");
            return (Criteria) this;
        }

        public Criteria andProtb200ca04NotBetween(Integer value1, Integer value2) {
            addCriterion("PROTB200CA04 not between", value1, value2, "protb200ca04");
            return (Criteria) this;
        }

        public Criteria andProtb200cc00IsNull() {
            addCriterion("PROTB200CC00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb200cc00IsNotNull() {
            addCriterion("PROTB200CC00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb200cc00EqualTo(Date value) {
            addCriterion("PROTB200CC00 =", value, "protb200cc00");
            return (Criteria) this;
        }

        public Criteria andProtb200cc00NotEqualTo(Date value) {
            addCriterion("PROTB200CC00 <>", value, "protb200cc00");
            return (Criteria) this;
        }

        public Criteria andProtb200cc00GreaterThan(Date value) {
            addCriterion("PROTB200CC00 >", value, "protb200cc00");
            return (Criteria) this;
        }

        public Criteria andProtb200cc00GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB200CC00 >=", value, "protb200cc00");
            return (Criteria) this;
        }

        public Criteria andProtb200cc00LessThan(Date value) {
            addCriterion("PROTB200CC00 <", value, "protb200cc00");
            return (Criteria) this;
        }

        public Criteria andProtb200cc00LessThanOrEqualTo(Date value) {
            addCriterion("PROTB200CC00 <=", value, "protb200cc00");
            return (Criteria) this;
        }

        public Criteria andProtb200cc00In(List<Date> values) {
            addCriterion("PROTB200CC00 in", values, "protb200cc00");
            return (Criteria) this;
        }

        public Criteria andProtb200cc00NotIn(List<Date> values) {
            addCriterion("PROTB200CC00 not in", values, "protb200cc00");
            return (Criteria) this;
        }

        public Criteria andProtb200cc00Between(Date value1, Date value2) {
            addCriterion("PROTB200CC00 between", value1, value2, "protb200cc00");
            return (Criteria) this;
        }

        public Criteria andProtb200cc00NotBetween(Date value1, Date value2) {
            addCriterion("PROTB200CC00 not between", value1, value2, "protb200cc00");
            return (Criteria) this;
        }

        public Criteria andProtb200cc01IsNull() {
            addCriterion("PROTB200CC01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb200cc01IsNotNull() {
            addCriterion("PROTB200CC01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb200cc01EqualTo(String value) {
            addCriterion("PROTB200CC01 =", value, "protb200cc01");
            return (Criteria) this;
        }

        public Criteria andProtb200cc01NotEqualTo(String value) {
            addCriterion("PROTB200CC01 <>", value, "protb200cc01");
            return (Criteria) this;
        }

        public Criteria andProtb200cc01GreaterThan(String value) {
            addCriterion("PROTB200CC01 >", value, "protb200cc01");
            return (Criteria) this;
        }

        public Criteria andProtb200cc01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB200CC01 >=", value, "protb200cc01");
            return (Criteria) this;
        }

        public Criteria andProtb200cc01LessThan(String value) {
            addCriterion("PROTB200CC01 <", value, "protb200cc01");
            return (Criteria) this;
        }

        public Criteria andProtb200cc01LessThanOrEqualTo(String value) {
            addCriterion("PROTB200CC01 <=", value, "protb200cc01");
            return (Criteria) this;
        }

        public Criteria andProtb200cc01Like(String value) {
            addCriterion("PROTB200CC01 like", value, "protb200cc01");
            return (Criteria) this;
        }

        public Criteria andProtb200cc01NotLike(String value) {
            addCriterion("PROTB200CC01 not like", value, "protb200cc01");
            return (Criteria) this;
        }

        public Criteria andProtb200cc01In(List<String> values) {
            addCriterion("PROTB200CC01 in", values, "protb200cc01");
            return (Criteria) this;
        }

        public Criteria andProtb200cc01NotIn(List<String> values) {
            addCriterion("PROTB200CC01 not in", values, "protb200cc01");
            return (Criteria) this;
        }

        public Criteria andProtb200cc01Between(String value1, String value2) {
            addCriterion("PROTB200CC01 between", value1, value2, "protb200cc01");
            return (Criteria) this;
        }

        public Criteria andProtb200cc01NotBetween(String value1, String value2) {
            addCriterion("PROTB200CC01 not between", value1, value2, "protb200cc01");
            return (Criteria) this;
        }

        public Criteria andProtb200cc02IsNull() {
            addCriterion("PROTB200CC02 is null");
            return (Criteria) this;
        }

        public Criteria andProtb200cc02IsNotNull() {
            addCriterion("PROTB200CC02 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb200cc02EqualTo(Date value) {
            addCriterion("PROTB200CC02 =", value, "protb200cc02");
            return (Criteria) this;
        }

        public Criteria andProtb200cc02NotEqualTo(Date value) {
            addCriterion("PROTB200CC02 <>", value, "protb200cc02");
            return (Criteria) this;
        }

        public Criteria andProtb200cc02GreaterThan(Date value) {
            addCriterion("PROTB200CC02 >", value, "protb200cc02");
            return (Criteria) this;
        }

        public Criteria andProtb200cc02GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB200CC02 >=", value, "protb200cc02");
            return (Criteria) this;
        }

        public Criteria andProtb200cc02LessThan(Date value) {
            addCriterion("PROTB200CC02 <", value, "protb200cc02");
            return (Criteria) this;
        }

        public Criteria andProtb200cc02LessThanOrEqualTo(Date value) {
            addCriterion("PROTB200CC02 <=", value, "protb200cc02");
            return (Criteria) this;
        }

        public Criteria andProtb200cc02In(List<Date> values) {
            addCriterion("PROTB200CC02 in", values, "protb200cc02");
            return (Criteria) this;
        }

        public Criteria andProtb200cc02NotIn(List<Date> values) {
            addCriterion("PROTB200CC02 not in", values, "protb200cc02");
            return (Criteria) this;
        }

        public Criteria andProtb200cc02Between(Date value1, Date value2) {
            addCriterion("PROTB200CC02 between", value1, value2, "protb200cc02");
            return (Criteria) this;
        }

        public Criteria andProtb200cc02NotBetween(Date value1, Date value2) {
            addCriterion("PROTB200CC02 not between", value1, value2, "protb200cc02");
            return (Criteria) this;
        }

        public Criteria andProtb200cc03IsNull() {
            addCriterion("PROTB200CC03 is null");
            return (Criteria) this;
        }

        public Criteria andProtb200cc03IsNotNull() {
            addCriterion("PROTB200CC03 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb200cc03EqualTo(String value) {
            addCriterion("PROTB200CC03 =", value, "protb200cc03");
            return (Criteria) this;
        }

        public Criteria andProtb200cc03NotEqualTo(String value) {
            addCriterion("PROTB200CC03 <>", value, "protb200cc03");
            return (Criteria) this;
        }

        public Criteria andProtb200cc03GreaterThan(String value) {
            addCriterion("PROTB200CC03 >", value, "protb200cc03");
            return (Criteria) this;
        }

        public Criteria andProtb200cc03GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB200CC03 >=", value, "protb200cc03");
            return (Criteria) this;
        }

        public Criteria andProtb200cc03LessThan(String value) {
            addCriterion("PROTB200CC03 <", value, "protb200cc03");
            return (Criteria) this;
        }

        public Criteria andProtb200cc03LessThanOrEqualTo(String value) {
            addCriterion("PROTB200CC03 <=", value, "protb200cc03");
            return (Criteria) this;
        }

        public Criteria andProtb200cc03Like(String value) {
            addCriterion("PROTB200CC03 like", value, "protb200cc03");
            return (Criteria) this;
        }

        public Criteria andProtb200cc03NotLike(String value) {
            addCriterion("PROTB200CC03 not like", value, "protb200cc03");
            return (Criteria) this;
        }

        public Criteria andProtb200cc03In(List<String> values) {
            addCriterion("PROTB200CC03 in", values, "protb200cc03");
            return (Criteria) this;
        }

        public Criteria andProtb200cc03NotIn(List<String> values) {
            addCriterion("PROTB200CC03 not in", values, "protb200cc03");
            return (Criteria) this;
        }

        public Criteria andProtb200cc03Between(String value1, String value2) {
            addCriterion("PROTB200CC03 between", value1, value2, "protb200cc03");
            return (Criteria) this;
        }

        public Criteria andProtb200cc03NotBetween(String value1, String value2) {
            addCriterion("PROTB200CC03 not between", value1, value2, "protb200cc03");
            return (Criteria) this;
        }

        public Criteria andProtb200cd00IsNull() {
            addCriterion("PROTB200CD00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb200cd00IsNotNull() {
            addCriterion("PROTB200CD00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb200cd00EqualTo(String value) {
            addCriterion("PROTB200CD00 =", value, "protb200cd00");
            return (Criteria) this;
        }

        public Criteria andProtb200cd00NotEqualTo(String value) {
            addCriterion("PROTB200CD00 <>", value, "protb200cd00");
            return (Criteria) this;
        }

        public Criteria andProtb200cd00GreaterThan(String value) {
            addCriterion("PROTB200CD00 >", value, "protb200cd00");
            return (Criteria) this;
        }

        public Criteria andProtb200cd00GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB200CD00 >=", value, "protb200cd00");
            return (Criteria) this;
        }

        public Criteria andProtb200cd00LessThan(String value) {
            addCriterion("PROTB200CD00 <", value, "protb200cd00");
            return (Criteria) this;
        }

        public Criteria andProtb200cd00LessThanOrEqualTo(String value) {
            addCriterion("PROTB200CD00 <=", value, "protb200cd00");
            return (Criteria) this;
        }

        public Criteria andProtb200cd00Like(String value) {
            addCriterion("PROTB200CD00 like", value, "protb200cd00");
            return (Criteria) this;
        }

        public Criteria andProtb200cd00NotLike(String value) {
            addCriterion("PROTB200CD00 not like", value, "protb200cd00");
            return (Criteria) this;
        }

        public Criteria andProtb200cd00In(List<String> values) {
            addCriterion("PROTB200CD00 in", values, "protb200cd00");
            return (Criteria) this;
        }

        public Criteria andProtb200cd00NotIn(List<String> values) {
            addCriterion("PROTB200CD00 not in", values, "protb200cd00");
            return (Criteria) this;
        }

        public Criteria andProtb200cd00Between(String value1, String value2) {
            addCriterion("PROTB200CD00 between", value1, value2, "protb200cd00");
            return (Criteria) this;
        }

        public Criteria andProtb200cd00NotBetween(String value1, String value2) {
            addCriterion("PROTB200CD00 not between", value1, value2, "protb200cd00");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}