INSERT INTO patients (name, email, birth_date, gender, blood_group)
VALUES
    ('Nishu', 'nishu@test.com', '20-02-01', 'male', 'O_POSITIVE'),
    ('Prashu', 'prashu@test.com', '20-02-04', 'male', 'B_POSITIVE'),
    ('Manu', 'manu@test.com', '20-03-01', 'male', 'A_POSITIVE'),
    ('Test', 'test@domain.com', '20-04-01', 'female', 'A_POSITIVE'),
    ('Nina', 'nina@test.com', '10-02-01', 'female', 'AB_POSITIVE');

INSERT INTO doctor (name, specialization, email)
VALUES
    ('Dr. Rakesh Mehta', 'Cardiology', 'rakesh@test.com'),
    ('Dr. Sneha Kapoor', 'Dermatology', 'sneha@test.com'),
    ('Dr. Arjun Nair', 'Orthopedics', 'arjun@test.com');


INSERT INTO appointment (appointment_time, reason, doctor_id, patient_id)
VALUES
    ('2025-07-01 10:30:00', 'General Checkup', 1, 2),
    ('2025-07-02 11:00:00', 'Skin Rash', 2, 2),
    ('2025-07-03 09:45:00', 'Knee Pain', 3, 3),
    ('2025-07-04 14:00:00', 'Follow-up Visit', 1, 1),
    ('2025-07-05 16:15:00', 'Consultation', 1, 4),
    ('2025-07-06 08:30:00', 'Allergy Treatment', 2, 5);