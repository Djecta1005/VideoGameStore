# 🎬 VideoGameStore
 
**Staff application for a film and game rental shop** — catalogue inventory 📦, customers 👥, rentals and returns 🔄, and accumulated fines 💰.
 
A rental shop lending out films and computer games needs its employees to handle the
same handful of jobs all day: find out what is in stock, register a rental, take an item
back, and tell a customer what they owe. VideoGameStore puts those jobs behind one
staff-only interface, on top of a relational database that keeps the catalogue,
the customers and the rental history consistent.
 
---
 
## ✨ What it does
 
**Queries** — read-only questions the staff ask constantly:
 
- 🔍 Search the catalogue by title, category or availability
- 📦 Current stock levels, and which copies are out on rental
- 👤 Look up a customer and see their rental history
- 💰 Outstanding fines per customer
- 📊 What is overdue right now
**Transactions** — operations that change the data, and must not half-happen:
 
- ➕ Add, update or remove a catalogue item
- 🔄 Register a rental and a return
- 👥 Register a new customer and edit their details
- 💸 Accumulate a fine on an overdue return, and record a payment
Only shop employees have access 🔐 — there is no customer-facing side.
 
---
 
## 🧱 Data model
 
<!-- TODO: replace with your real tables and keys, or drop in an ER diagram image -->
 
| Table | Holds |
|---|---|
| `customer` | Customer record and contact details |
| `item` | Catalogue entry: title, type (film / game), category |
| `copy` | A physical copy of an item, and its availability |
| `rental` | Which copy went to which customer, when, and when it came back |
| `fine` | Fines accrued per customer, and whether they are settled |
 
A rental and a return each touch more than one table, so both run inside a database
transaction: either every row changes or none does. That is the point of the project —
the rules live in the schema and the transactions, not in the interface.
 

---
 
## 🚀 Getting started
 
```bash
# 1. clone
git clone https://github.com/Djecta1005/VideoGameStore.git
cd VideoGameStore
 
# 2. create the database and load the schema
# TODO: the real commands, e.g.
# psql -U postgres -f sql/schema.sql
# psql -U postgres -f sql/seed.sql
 
# 3. run the application

```

 
## 👤 Authors
 
**Hibat Djecta** 

**Leticia Sadi** 

 
