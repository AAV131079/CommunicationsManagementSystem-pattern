insert into CommunicationsManagement.booking_status_type (booking_status_type_id, description, name)
    values
        (1, 'Забронирован на весь лимит времени.', 'Забронирован'),
        (2, 'Бронь времмено приостановлена. Возможно возобновление брони до окончания лимита времени.', 'Бронь приостановлена'),
        (3, 'Бронь отменена. Возобновление невозможно.', 'Бронь отменена');