-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 08, 2024 at 01:23 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `atu`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `surname` varchar(255) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `phone` int(11) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `ppsn` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `course_fk` int(11) DEFAULT NULL,
  `role_fk` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`id`, `name`, `surname`, `birthday`, `phone`, `email`, `password`, `ppsn`, `address`, `course_fk`, `role_fk`) VALUES
(15, 'staff', 'staff', '2024-03-07', 666999666, 'staff@gmail.com', 'staff', 'ppsn', 'address', NULL, 3),
(16, 'pepe', 'aburrito', '1997-03-07', 21212121, 'pepe@gmail.com', 'pepe', '121221dsds', 'rocks', 4, 1),
(17, 'teacher', 'teaching', '1997-03-06', 21212121, 'teacher@gmail.com', 'teacher', '121221dsds', 'rocks', NULL, 2),
(18, 'nelson', 'mandela', '2001-03-14', 121121212, 'nelson@gmail.com', 'nelson', '12121221', 'galway', 5, 1),
(19, 'daniel', 'sasaas', '2007-03-21', 1222121, 'daniel@gmail.com', 'daniel', '211221', '21211221', NULL, 2);

-- --------------------------------------------------------

--
-- Table structure for table `account_booking`
--

CREATE TABLE `account_booking` (
  `id` int(11) NOT NULL,
  `account_fk` int(11) DEFAULT NULL,
  `booking_fk` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `account_exam`
--

CREATE TABLE `account_exam` (
  `id` int(11) NOT NULL,
  `result` double DEFAULT NULL,
  `report_fk` int(11) DEFAULT NULL,
  `account_fk` int(11) DEFAULT NULL,
  `exam_fk` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `account_module`
--

CREATE TABLE `account_module` (
  `id` int(11) NOT NULL,
  `account_fk` int(11) DEFAULT NULL,
  `module_fk` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `account_module`
--

INSERT INTO `account_module` (`id`, `account_fk`, `module_fk`) VALUES
(5, 10, 1),
(13, 14, 2),
(14, 17, 6),
(15, 19, 8);

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE `booking` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `current_slot` int(11) DEFAULT 0,
  `max_slot` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `chat`
--

CREATE TABLE `chat` (
  `id` int(11) NOT NULL,
  `message` varchar(255) DEFAULT NULL,
  `message_date` datetime DEFAULT current_timestamp(),
  `account_sender_fk` int(11) NOT NULL,
  `account_receiver_fk` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `chat`
--

INSERT INTO `chat` (`id`, `message`, `message_date`, `account_sender_fk`, `account_receiver_fk`) VALUES
(10, 'test 1', '2024-03-07 23:02:37', 16, 17),
(11, 'test 2', '2024-03-07 23:02:41', 16, 17),
(12, 'hi pepe', '2024-03-07 23:03:18', 17, 16),
(13, 'workss', '2024-03-07 23:03:30', 16, 17),
(14, 'nelson here!', '2024-03-08 11:22:54', 18, 17),
(15, 'testing 123', '2024-03-08 11:23:27', 18, 17),
(16, 'hi nelson how are you?', '2024-03-08 11:23:39', 17, 18),
(17, 'hi nelson!', '2024-03-08 11:50:44', 19, 18),
(18, 'hi', '2024-03-08 11:50:50', 18, 19);

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE `course` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `code` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `course`
--

INSERT INTO `course` (`id`, `name`, `code`) VALUES
(4, 'mathematic', 'mat'),
(5, 'spanish', 'SPA'),
(6, 'software dev', 'softdev');

-- --------------------------------------------------------

--
-- Table structure for table `course_module`
--

CREATE TABLE `course_module` (
  `id` int(11) NOT NULL,
  `course_fk` int(11) DEFAULT NULL,
  `module_fk` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `course_module`
--

INSERT INTO `course_module` (`id`, `course_fk`, `module_fk`) VALUES
(12, 4, 6),
(13, 5, 7),
(14, 6, 8);

-- --------------------------------------------------------

--
-- Table structure for table `exam`
--

CREATE TABLE `exam` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `exam_date` datetime DEFAULT NULL,
  `course_fk` int(11) DEFAULT NULL,
  `module_fk` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `module`
--

CREATE TABLE `module` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `module`
--

INSERT INTO `module` (`id`, `name`) VALUES
(6, 'MATHS'),
(7, 'barcelona'),
(8, 'programming');

-- --------------------------------------------------------

--
-- Table structure for table `report`
--

CREATE TABLE `report` (
  `id` int(11) NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `report_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `role`
--

CREATE TABLE `role` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `role`
--

INSERT INTO `role` (`id`, `name`) VALUES
(1, 'Student'),
(2, 'Teacher'),
(3, 'Staff');

-- --------------------------------------------------------

--
-- Table structure for table `timetable`
--

CREATE TABLE `timetable` (
  `id` int(11) NOT NULL,
  `day_of_week` int(11) DEFAULT NULL,
  `hour` time DEFAULT NULL,
  `course_fk` int(11) DEFAULT NULL,
  `module_fk` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `email` (`email`),
  ADD KEY `course_fk` (`course_fk`),
  ADD KEY `role_fk` (`role_fk`);

--
-- Indexes for table `account_booking`
--
ALTER TABLE `account_booking`
  ADD PRIMARY KEY (`id`),
  ADD KEY `account_fk` (`account_fk`),
  ADD KEY `booking_fk` (`booking_fk`);

--
-- Indexes for table `account_exam`
--
ALTER TABLE `account_exam`
  ADD PRIMARY KEY (`id`),
  ADD KEY `report_fk` (`report_fk`),
  ADD KEY `account_fk` (`account_fk`),
  ADD KEY `exam_fk` (`exam_fk`);

--
-- Indexes for table `account_module`
--
ALTER TABLE `account_module`
  ADD PRIMARY KEY (`id`),
  ADD KEY `account_fk` (`account_fk`),
  ADD KEY `module_fk` (`module_fk`);

--
-- Indexes for table `booking`
--
ALTER TABLE `booking`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `chat`
--
ALTER TABLE `chat`
  ADD PRIMARY KEY (`id`),
  ADD KEY `account_sender_fk` (`account_sender_fk`),
  ADD KEY `account_receiver_fk` (`account_receiver_fk`);

--
-- Indexes for table `course`
--
ALTER TABLE `course`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `code_UNIQUE` (`code`);

--
-- Indexes for table `course_module`
--
ALTER TABLE `course_module`
  ADD PRIMARY KEY (`id`),
  ADD KEY `course_fk` (`course_fk`),
  ADD KEY `module_fk` (`module_fk`);

--
-- Indexes for table `exam`
--
ALTER TABLE `exam`
  ADD PRIMARY KEY (`id`),
  ADD KEY `course_fk` (`course_fk`),
  ADD KEY `module_fk` (`module_fk`);

--
-- Indexes for table `module`
--
ALTER TABLE `module`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `report`
--
ALTER TABLE `report`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `role`
--
ALTER TABLE `role`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `timetable`
--
ALTER TABLE `timetable`
  ADD PRIMARY KEY (`id`),
  ADD KEY `course_fk` (`course_fk`),
  ADD KEY `module_fk` (`module_fk`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `account`
--
ALTER TABLE `account`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT for table `account_booking`
--
ALTER TABLE `account_booking`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `account_exam`
--
ALTER TABLE `account_exam`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `account_module`
--
ALTER TABLE `account_module`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `booking`
--
ALTER TABLE `booking`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `chat`
--
ALTER TABLE `chat`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `course`
--
ALTER TABLE `course`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `course_module`
--
ALTER TABLE `course_module`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `exam`
--
ALTER TABLE `exam`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `module`
--
ALTER TABLE `module`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `report`
--
ALTER TABLE `report`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `role`
--
ALTER TABLE `role`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `timetable`
--
ALTER TABLE `timetable`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `account`
--
ALTER TABLE `account`
  ADD CONSTRAINT `account_ibfk_1` FOREIGN KEY (`course_fk`) REFERENCES `course` (`id`) ON DELETE SET NULL,
  ADD CONSTRAINT `account_ibfk_2` FOREIGN KEY (`role_fk`) REFERENCES `role` (`id`);

--
-- Constraints for table `account_booking`
--
ALTER TABLE `account_booking`
  ADD CONSTRAINT `account_booking_ibfk_1` FOREIGN KEY (`account_fk`) REFERENCES `account` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `account_booking_ibfk_2` FOREIGN KEY (`booking_fk`) REFERENCES `booking` (`id`) ON DELETE CASCADE;

--
-- Constraints for table `account_exam`
--
ALTER TABLE `account_exam`
  ADD CONSTRAINT `account_exam_ibfk_1` FOREIGN KEY (`report_fk`) REFERENCES `report` (`id`) ON DELETE SET NULL,
  ADD CONSTRAINT `account_exam_ibfk_2` FOREIGN KEY (`account_fk`) REFERENCES `account` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `account_exam_ibfk_3` FOREIGN KEY (`exam_fk`) REFERENCES `exam` (`id`) ON DELETE CASCADE;

--
-- Constraints for table `account_module`
--
ALTER TABLE `account_module`
  ADD CONSTRAINT `account_module_ibfk_1` FOREIGN KEY (`account_fk`) REFERENCES `account` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `account_module_ibfk_2` FOREIGN KEY (`module_fk`) REFERENCES `module` (`id`) ON DELETE CASCADE;

--
-- Constraints for table `chat`
--
ALTER TABLE `chat`
  ADD CONSTRAINT `chat_ibfk_1` FOREIGN KEY (`account_sender_fk`) REFERENCES `account` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `chat_ibfk_2` FOREIGN KEY (`account_receiver_fk`) REFERENCES `account` (`id`) ON DELETE CASCADE;

--
-- Constraints for table `course_module`
--
ALTER TABLE `course_module`
  ADD CONSTRAINT `course_module_ibfk_1` FOREIGN KEY (`course_fk`) REFERENCES `course` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `course_module_ibfk_2` FOREIGN KEY (`module_fk`) REFERENCES `module` (`id`) ON DELETE CASCADE;

--
-- Constraints for table `exam`
--
ALTER TABLE `exam`
  ADD CONSTRAINT `exam_ibfk_1` FOREIGN KEY (`course_fk`) REFERENCES `course` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `exam_ibfk_2` FOREIGN KEY (`module_fk`) REFERENCES `module` (`id`) ON DELETE CASCADE;

--
-- Constraints for table `timetable`
--
ALTER TABLE `timetable`
  ADD CONSTRAINT `timetable_ibfk_1` FOREIGN KEY (`course_fk`) REFERENCES `course` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `timetable_ibfk_2` FOREIGN KEY (`module_fk`) REFERENCES `module` (`id`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
